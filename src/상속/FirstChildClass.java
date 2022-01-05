package 상속;

public class FirstChildClass extends ParentClass{
	public FirstChildClass() {
		System.out.println("FirstChildClass constructor");
	}
	public void childFun() {
		System.out.println("childFun()");
	}
	@Override
	public void makeJJajang() {
		System.out.println("-- FirstChildClass's more makeJJajang() --");
	}
}