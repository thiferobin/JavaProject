package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class FruitCheck {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();

		fruits.add(new Apple("Apple", "red"));
		fruits.add(new Papaya("Papaya", "green"));
		fruits.add(new Orange("Orange", "orange"));
		fruits.add(new Banana("Banana", "yellow"));
		
		for(Fruit f : fruits){
			System.out.println(f.getName()+" , "+f.getColor());
		}
//		System.out.println(fruits.get(0).getName()+" , "+fruits.get(0).getColor());

	}

}
