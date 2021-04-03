package com.library;

import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.security.AuthProvider;
import java.util.*;

public abstract class admin {
    String admin;



      public class addLibrarian extends admin {

          void addLibrarian() {
              ArrayList<String> list= new ArrayList<>();
              list.add("Mike");
              list.add("Peter");
              list.add("Adam");
              System.out.println(list);
          }


      }
      public class removeLibrarian extends addLibrarian{
          void removeLibrarian(){
              ArrayList<String> list=new ArrayList<>();
              list.remove("Mike");
              list.remove("Adam");
          }
      }

      public class viewLibrarian extends admin{
          void viewLibrarian(){
              String[] list = new String[0];
              for(String librarians:list)
              System.out.println("the list of active librarians is " + librarians);
          }
      }

      public class logOutLibrarian extends addLibrarian{
          void logOutLibrarian() throws LoginException {
              LoginModule list = null;
              boolean peter = list.logout();

              System.out.println(" you have successfully logged out " + list);
          }
      }

      public class adminLogout extends admin{
          void logOut(){

              System.out.println("you have successfully logged out.");
          }
      }

}
