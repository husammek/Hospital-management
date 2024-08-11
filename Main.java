package hospital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			PatientList plist = new PatientList();
			DocList dlist = new DocList();
			String choices;
			while (true) {
				MainMenu();

				choices = scan.nextLine();

				if (choices.equals("1")) {

					System.out.println("\n Doctor ID");

					String id = scan.nextLine();

					System.out.println("\n Doctor Name");

					String name = scan.nextLine();

					System.out.println("\n Doctor contact");

					String contact = scan.nextLine();

					System.out.println("\n Doctor Speciality");
					String spec = scan.nextLine();
					System.out.println("\n Doctor fee ");
					int fee = scan.nextInt();
					scan.nextLine();

					Doctor d = new Doctor(id, name, contact, spec, fee);
					dlist.InsertD(d);
				} else if (choices.equals("2")) {

					System.out.println("\n Patient ID");
					String id = scan.nextLine();

					System.out.println("\n Patient Name");
					String name = scan.nextLine();

					System.out.println("\n Patient Contact");
					String contact = scan.nextLine();
					Patient p = new Patient(id, name, contact);
					plist.InsertP(p);

				} else if (choices.equals("3")) {
					dlist.printDoctorData();
				} else if (choices.equals("4")) {
					plist.printPatientData();
				} else if (choices.equals("5")) {
					System.out.println("\nWelcome To CheckUp Menu ");

					CheckUpList[] clist = new CheckUpList[dlist.size()];

					for (int i = 0; i < clist.length; i++) {
						clist[i] = new CheckUpList();

						Doctor doctor = dlist.getAtIndex(i);

						System.out.println("\nEnter patient for doctor");

						System.out.println("Name      : " + doctor.getName());
						System.out.println("Speciality: " + doctor.getSpecialty());
						System.out.println("Fees      : " + doctor.getFees());

						System.out.println("All Patients:");
						plist.printPatientData();
						while (true) {
							System.out.println("Enter Patient Id or null to stop");
							String id = scan.nextLine();
							if (id.equals("null")) {
								break;
							}
							System.out.println(
									"Enter 3 for Priority, 2 for emergency, any number for intermediate situation");
							String per = scan.nextLine();
							int p = 1;
							if (per.equals("3")) {
								p = 3;
							} else if (per.equals("2")) {
								p = 2;
							}
							Patient patient = plist.SearchById(id);
							if (patient == null) {
								System.out.println("\nInvalid Patient Id");

							} else {
								CheckUp cup = new CheckUp(doctor, patient, "" + "", p);
								clist[i].Enqueue(cup);
							}
						}
					}
					for (int i = 0; i < clist.length; i++) {
						System.out.println(
								"\nPatient " + (i + 1) + " In queue for Doctor" + dlist.getAtIndex(i).getName());
						for (int j = 0; j < clist[i].size(); j++) {
							System.out.println("Enter Recomendation medicine for the Patient" + clist[i].getPatient(j));
							String rec = scan.nextLine();
							clist[i].addRecomendation(j, rec);
						}
					}
				} else if (choices.equals("0")) {
					break;
				} else {
					System.out.println("\nInvalid Choice");
				}
			}
		}
	}

	public static void MainMenu() {

		System.out.println("**Welcome to the Hospital**");

		System.out.println("|||   Main Menu   |||");
		System.out.println("Enter 1 for Insert New Doctor");

		System.out.println("Enter 2 for Insert Patient");
		System.out.println("Enter 3 for Print all Doctor");

		System.out.println("Enter 4 for Print all Patient ");

		System.out.println("Enter 5 for checkup menu");
		System.out.println("Enter 0 to Exit");

	}

}
