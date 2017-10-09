package paging;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

import comparators.CommodityByWeightAsc;
import comparators.CommodityByWeightDesc;
import comparators.ComodityByNameAsc;
import comparators.ComodityByNameDesc;
import comparators.ComodityByPriceAsc;
import comparators.ComodityByPriceDesc;

public class Exx002 {
	public static ArrayList<Comodity> list = new ArrayList<>();

	public static void main(String[] args) {
		init();
		list.sort(new ComodityByNameAsc());

		printResult(list, 0, 9, false, new ComodityByNameAsc());

	}

	public static void printResult(ArrayList<Comodity> list, int firstelement, int elprpage, Boolean reverseSort,
			Comparator<Comodity> comparator) {
		List<Comodity> mylist;
		// list.sort(comparator);
		mylist = list.stream().sorted(comparator).skip(firstelement).limit(elprpage).collect(toList());

		ListIterator li = mylist.listIterator();
		System.out.print("\n");
		while (li.hasNext()) {
			if ((li.nextIndex() + 1) % 3 == 0)
				System.out.printf("%s\n", li.next());
			else
				System.out.printf("%s\t\t", li.next());
		}
		System.out.printf("\nÑòîð³íêè \t\t\t\t");
		for (int i = 1; i <= list.size() / elprpage + 1; i++)
			if (i == (firstelement / elprpage) + 1)
				System.out.printf("{%d} ", i);
			else
				System.out.printf("%d ", i);
		System.out.println("\n");

		menu();
		String[] com = inpunCmd().split(",");

		switch (com.length) {
		case 4:
			switch (com[3]) {
			case "desc":
				reverseSort = true;
				break;
			case "asc":
				reverseSort = false;
				break;
			}
		case 3:
			switch (com[2]) {
			case "name":
				comparator = (reverseSort) ? new ComodityByNameDesc() : new ComodityByNameAsc();
				break;
			case "price":
				comparator = (reverseSort) ? new ComodityByPriceDesc() : new ComodityByPriceAsc();
				break;
			case "weight":
				comparator = (reverseSort) ? new CommodityByWeightDesc() : new CommodityByWeightAsc();
				break;
			}
		case 2:
			elprpage = Integer.parseInt(com[1]);
		case 1:
			if (com[0].equals("000"))
				System.exit(0);
			if (com.length > 1)
				firstelement = Integer.parseInt(com[0]);
			else
				firstelement = (Integer.parseInt(com[0]) - 1) * elprpage;
			break;
		}
		printResult(list, firstelement, elprpage, reverseSort, comparator);
	}

	public static void init() {
		int imax = 100;
		Random r = new Random();
		for (int i = 0; i < imax; i++) {
			Comodity comodity = new Comodity("item" + (i + 1), r.nextInt(500), r.nextInt(1000));
			list.add(comodity);
		}
	}

	public static void menu() {
		System.out.printf("\n\nвведіть номер сторінки щоб на неї перейти\n"
				+ "введіть номер сторінки і кількість товарів яку ви хочете побачити(наприклад n,k)\n"
				+ "--//--//-- сортування по полю(введуть n,k,field  - назва поля по якому можна посортувати name/price/weight)\n"
				+ "--//--//-- сортування від меншого до більшого і навпаки(введіть n,k,field,sortType - від меншого до більшого sortType =asc; desc - від більшого до меншого)\n");
	}

	public static String inpunCmd() {
		String com = null;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			com = scanner.next();
			break;
		}

		return com;
	}
}
