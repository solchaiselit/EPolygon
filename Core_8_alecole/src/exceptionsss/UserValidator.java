package exceptionsss;

public class UserValidator implements Validator {

	@Override
	public void validate(Object object) throws Exception {
		// TODO Auto-generated method stub

		User user = (User) object;
		try {
               
			System.out.println();
			
			if (user.getLogin().equalsIgnoreCase("lambo")) {
				throw new UserException(
						ValidationMessages.LOGIN_VALIDATION_EXCEPTION);
			} else if (!user.getEmail().contains("@")) {
				throw new UserException(
						ValidationMessages.EMAIL_VALIDATION_EXCEPTION);
			}

		}

		catch (UserException e) {
			System.out.println(e.getMessage());
		}

	}

}
