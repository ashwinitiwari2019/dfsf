package Package3;

import org.testng.annotations.Test;

public class TestNG {
  @Test(priority=3) //annotation // No Duplicate Methods // @test at least one is mandatory 
  public void Launch() {
	  System.out.println("code for launch");
  }
  @Test(priority=2)
  public void Register() {
  System.out.println("code for Register");
  }
  @Test(priority=1)
  public void Login() {
  System.out.println("code for login");
  }
}
