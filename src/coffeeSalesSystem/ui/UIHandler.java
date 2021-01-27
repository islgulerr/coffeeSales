package coffeeSalesSystem.ui;

import java.util.Scanner;

import coffeeSalesSystem.dataAccess.concretes.EdevletDao;
import coffeeSalesSystem.entities.concretes.Campaign;
import coffeeSalesSystem.entities.concretes.NeroCompany;
import coffeeSalesSystem.entities.concretes.NeroCompanyCustomers;
import coffeeSalesSystem.entities.concretes.StarbucksCompany;
import coffeeSalesSystem.entities.concretes.StarbucksCompanyCustomers;

public class UIHandler {
	private NeroCompany nero;
	private StarbucksCompany starbucks;
	private Scanner scanner = new Scanner(System.in);

	public UIHandler(StarbucksCompany starbucks, NeroCompany nero) {
		this.starbucks = starbucks;
		this.nero = nero;

		this.companyUI();
	}

	private void companyUI() {
		while (true) {
			System.out.println("Sirketi secin:");
			System.out.println("--------------");
			System.out.println("1 - Starbucks");
			System.out.println("2 - Nero");
			System.out.println("3 - Cikis");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				starbucksEntryUI();
				break;
			case 2:
				neroEntryUI();
				break;
			case 3:
				System.out.println("Ýyi Gunler!");
				return;
			default:
				System.out.println("Tanimlanmamis secenek!");
				break;
			}
		}
	}

	private void starbucksEntryUI() {
		EdevletDao validation = new EdevletDao();

		while (true) {
			System.out.println("Starbucks'a Hosgeldiniz!");
			System.out.println("------------------------");
			System.out.println("1 - Giris Yap");
			System.out.println("2 - Kayit Ol");
			System.out.println("3 - Cikis");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Line Feed Buffer

			if (choice == 1) {
				System.out.print("TC numaranizi girin: ");
				String tc = scanner.nextLine();
				System.out.print("Ad: ");
				String name = scanner.nextLine();

				boolean isValid = false;
				for (StarbucksCompanyCustomers customer : starbucks.getStarbucksCustomers()) {
					if (customer.getTcNo().equals(tc) && customer.getName().equals(name)) {
						starbucksMenuUI(customer);
						isValid = true;
					}
				}

				if (!isValid) {
					System.out.println("Hatali giris yaptiniz!");
				}
			} else if (choice == 2) {
				System.out.print("TC: ");
				String TC = scanner.nextLine();
				System.out.print("Ad: ");
				String name = scanner.nextLine();
				System.out.print("Soyad: ");
				String surname = scanner.nextLine();
				System.out.print("Dogum Tarihi: ");
				String birthDate = scanner.nextLine();

				StarbucksCompanyCustomers instant = new StarbucksCompanyCustomers(TC, name, surname, birthDate);

				if (validation.isValid(instant)) {
					starbucks.getStarbucksCustomers().add(instant);
					System.out.println("Kayit basarili!");
				} else {
					System.out.println("E-Devlet sorgusunda kullanici bulunamadi!");
				}
			} else if (choice == 3) {
				return;
			} else {
				System.out.println("Tanimlanmamis secenek!");
			}
		}
	}

	private void starbucksMenuUI(StarbucksCompanyCustomers customer) {
		while (true) {
			System.out.println("Hosgeldiniz " + customer.getName());
			System.out.println("------------------------");
			System.out.println("1 - Profil");
			System.out.println("2 - Urün Al");
			System.out.println("3 - Kampanyalari Goster");
			System.out.println("4 - Cikis");

			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.println(customer);
			} else if (choice == 2) {
				for (int i = 0; i < starbucks.getCategories().size(); i += 1) {
					System.out.println((i + 1) + ". " + starbucks.getCategories().get(i).getCategoryName());
				}

				int category = scanner.nextInt() - 1;
				scanner.nextLine();

				for (int i = 0; i < starbucks.getCategories().get(category).getProducts().size(); i += 1) {
					System.out.println((i + 1) + ". "
							+ starbucks.getCategories().get(category).getProducts().get(i).getProductName() + " Fiyat:"
							+ starbucks.getCategories().get(category).getProducts().get(i).getUnitPrice() + "TL");
				}

				int product = scanner.nextInt() - 1;
				scanner.nextLine();

				System.out.println(starbucks.getCategories().get(category).getProducts().get(product).getProductName()
						+ " alýndý.");
				System.out.println("1 yildiz kazandiniz!");
				customer.setTotalStar(customer.getTotalStar() + 1);
			} else if (choice == 3) {
				for (Campaign campaign : starbucks.getCampaigns()) {
					System.out.println(campaign.getCampaignName());
				}
			} else if (choice == 4) {
				return;
			} else {
				System.out.println("Tanimlanmamis secenek!");
			}
		}
	}

	private void neroEntryUI() {
		while (true) {
			System.out.println("Nero'ya Hosgeldiniz!");
			System.out.println("------------------------");
			System.out.println("1 - Giris Yap");
			System.out.println("2 - Kayit Ol");
			System.out.println("3 - Cikis");

			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.print("Ad: ");
				String name = scanner.nextLine();
				System.out.print("Soyad: ");
				String surname = scanner.nextLine();

				boolean isValid = false;
				for (NeroCompanyCustomers customer : nero.getNeroCustomers()) {
					if (customer.getName().equals(name) && customer.getSurname().equals(surname)) {
						neroMenuUI(customer);
						isValid = true;
					}
				}

				if (!isValid) {
					System.out.println("Hatali giris yaptiniz!");
				}
			} else if (choice == 2) {
				System.out.print("Ad: ");
				String name = scanner.nextLine();
				System.out.print("Soyad: ");
				String surname = scanner.nextLine();
				System.out.print("Dogum Tarihi: ");
				String birthDate = scanner.nextLine();

				NeroCompanyCustomers instant = new NeroCompanyCustomers(name, surname, birthDate);
				nero.getNeroCustomers().add(instant);
				System.out.println("Kayit basarili!");
			} else if (choice == 3) {
				return;
			} else {
				System.out.println("Tanimlanmamis secenek!");
			}
		}
	}

	private void neroMenuUI(NeroCompanyCustomers customer) {
		while (true) {
			System.out.println("Hosgeldiniz " + customer.getName());
			System.out.println("------------------------");
			System.out.println("1 - Profil");
			System.out.println("2 - Ürün Al");
			System.out.println("3 - Kampanyalari Goster");
			System.out.println("4 - Cikis");

			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 1) {
				System.out.println(customer);
			} else if (choice == 2) {
				for (int i = 0; i < nero.getCategories().size(); i += 1) {
					System.out.println((i + 1) + ". " + nero.getCategories().get(i).getCategoryName());
				}

				int category = scanner.nextInt() - 1;
				scanner.nextLine();

				for (int i = 0; i < nero.getCategories().get(category).getProducts().size(); i += 1) {
					System.out.println((i + 1) + ". "
							+ nero.getCategories().get(category).getProducts().get(i).getProductName() + " Fiyat:"
							+ starbucks.getCategories().get(category).getProducts().get(i).getUnitPrice() + "TL");
				}

				int product = scanner.nextInt() - 1;
				scanner.nextLine();

				System.out.println(
						nero.getCategories().get(category).getProducts().get(product).getProductName() + " alýndý.");
			} else if (choice == 3) {
				for (Campaign campaign : nero.getCampaigns()) {
					System.out.println(campaign.getCampaignName());
				}
			} else if (choice == 4) {
				return;
			} else {
				System.out.println("Tanimlanmamis secenek!");
			}
		}
	}
}
