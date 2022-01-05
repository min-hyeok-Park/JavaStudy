package »ó¼Ó;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	public void childFun() {
		System.out.println("childFun()");
	}
	@Override
	public void makeJJajang() {
		System.out.println("-- SecondChildClass's more makeJJajang() --");
	}
}