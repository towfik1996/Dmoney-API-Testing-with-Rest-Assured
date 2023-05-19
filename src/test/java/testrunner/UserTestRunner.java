package testrunner;

import controller.User;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;

import java.io.IOException;

public class UserTestRunner extends Setup {
    User user;
    @Test(priority = 1)
    public void doLogin() throws ConfigurationException, IOException {
        user= new User();
        user.callLoginAPI();
        Assert.assertTrue(user.getMessage().contains("Login successfully"));
    }
    @Test(priority = 2)
    public void getUserList() throws IOException {
        user=new User();
        user.getUserList();
    }
    @Test(priority = 3)
    public void getUserById() throws IOException {
        user=new User();
        user.getUserById();
    }
    @Test(priority = 4)
    public void createUser() throws ConfigurationException, IOException {
        user=new User();
        user.createUser();
    }
}
