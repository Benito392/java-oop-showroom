public class Vehicle {
	protected String brand;
	protected String model;
	protected int year;

    // Constructor to initialize the vehicle attributes
	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

    // Method to display details
	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}

class Car extends Vehicle {
	private String fuelType;

    // constructor to initialize the car attributes, including those inherited from vehicle 
	public Car(String brand, String model, int year, String fuelType) {
		super(brand, model, year);  // Call parent constructor
		this.fuelType = fuelType;
	}

    // Override the displayDetails method to include fuel type information
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Fuel Type: " + fuelType);
	}
}

class Showroom {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter brand: ");
		String brand = scanner.nextLine();
		System.out.print("Enter model: ");
		String model = scanner.nextLine();
		System.out.print("Enter year: ");
		int year = 0;
		try {
			year = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid year input. Using 0.");
		}
		System.out.print("Enter fuel type: ");
		String fuelType = scanner.nextLine();

		Car car = new Car(brand, model, year, fuelType);
		System.out.println();
		car.displayDetails();
		scanner.close();
    }
}

