package sukkiri.object_oriented.polymorphism.sample01;

class Breeder {
	
	
	public void have(Animal animal) { //・・・③//もしAnimalがDogやCatの型だと、不便で、メソッドを二つ来る必要がある。
		System.out.println(animal.getKind() + "を飼っているの");
	}
	
	
	
}