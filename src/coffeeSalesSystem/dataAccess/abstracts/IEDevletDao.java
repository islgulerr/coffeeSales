package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.EdevletValidation;
import coffeeSalesSystem.entities.concretes.StarbucksCompanyCustomers;

import java.util.ArrayList;

public interface IEDevletDao {
	void add(EdevletValidation validation);

	void update(EdevletValidation validation);

	void delete(EdevletValidation validation);

	ArrayList<EdevletValidation> getAll();

	boolean isValid(StarbucksCompanyCustomers customer);
}
