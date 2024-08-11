package hospital;

public class CheckUp {
	Doctor Doctor;
	Patient Patient;
	String Recomendation, Date;
	int priority;

	public CheckUp(Doctor doctor, Patient patient, String recomendation, int priority) {
		Doctor = doctor;
		Patient = patient;
		Recomendation = recomendation;
		this.priority = priority;
	}

	public Doctor getDoctor() {
		return Doctor;
	}

	public void setDoctor(Doctor doctor) {
		Doctor = doctor;
	}

	public Patient getPatient() {
		return Patient;
	}

	public void setPatient(Patient patient) {
		Patient = patient;
	}

	public String getRecomendation() {
		return Recomendation;
	}

	public void setRecomendation(String recomendation) {
		Recomendation = recomendation;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String toString() {
		return "CheckUp [Doctor=" + Doctor.toString() + ", Patient=" + Patient.toString() + ", Recomendation="
				+ Recomendation + ", Date=" + Date + ", priority=" + priority + "]";
	}

}
