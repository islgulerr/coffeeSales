package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.EdevletValidation;
import coffeeSalesSystem.entities.concretes.StarbucksCompanyCustomers;
import coffeeSalesSystem.dataAccess.abstracts.IEDevletDao;

import java.util.ArrayList;

public class EdevletDao implements IEDevletDao {
	@Override
	public void add(EdevletValidation validation) {
		System.out.println(validation.getCitizenName() + " veritabanina eklendi.");
	}

	@Override
	public void update(EdevletValidation validation) {
		System.out.println(validation.getCitizenName() + " veritabani guncellendi.");
	}

	@Override
	public void delete(EdevletValidation validation) {
		System.out.println(validation.getCitizenName() + " veritabanindan silindi.");
	}

	@Override
	public ArrayList<EdevletValidation> getAll() {
		ArrayList<EdevletValidation> validations = new ArrayList<>();
		validations.add(new EdevletValidation("12345678912", "Isil", "Guler", "08.04.1998"));
		validations.add(new EdevletValidation("12345678913", "Berin", "Guven", "14.03.1988"));
		validations.add(new EdevletValidation("12345678914", "Engin", "Demirog", "20.12.1990"));
		validations.add(new EdevletValidation("12345678915", "Alya", "Ozbay", "14.03.1997"));
		validations.add(new EdevletValidation("1", "test1", "test2", "01.01.2001"));
		validations.add(new EdevletValidation("2", "a", "b", "01.01.1991"));

		return validations;
	}

	@Override
	public boolean isValid(StarbucksCompanyCustomers customer) {
		for (EdevletValidation citizen : getAll()) {
			if (citizen.getTurkishRepublicIdentificationNo().equals(customer.getTcNo())
					&& citizen.getCitizenName().equals(customer.getName())
					&& citizen.getCitizenSurname().equals(customer.getSurname())
					&& citizen.getCitizenBirthDate().equals(customer.getBirthDate())) {
				return true;
			}
		}
		return false;
	}
}
