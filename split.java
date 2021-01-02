package strings;

public class split {

	public static void main(String[] args) {
		String cars="Hyundai,Maruti,Ferrari,Lambhorghini";
		String allcars[]=cars.split(",");
		for(String car: allcars) {
			System.out.println(car);
		}

	}

}
