/* 
 * @author nby
 * @since 160404
 * demo how to use file decorator
 * 
 */

package com.j2.w5;

import java.io.File;
import java.io.FileInputStream;

public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    FileInputStream isReadme=null;
    try {
      int i;
      char c;
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      String cwd=new File("src/").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      File readme=new File(cwd, "HelloWorld.java");
      System.out.println("readme is "+readme);
      
      isReadme=new FileInputStream(readme);
      while((i=isReadme.read()) !=-1) {
        c=(char)i;
        System.out.print(c);
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      if(isReadme != null)
        isReadme.close();
    }
  }
}