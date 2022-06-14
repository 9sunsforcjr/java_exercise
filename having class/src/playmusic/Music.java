/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playmusic;

/**
 *
 * @author Mactavish
 */


import java.applet.AudioClip; 
import java.io.*; 
import java.applet.Applet;
import java.net.URI;
import java.net.URL;
import javax.swing.JFrame;
public class Music extends JFrame{ 
File f;
 URI uri;
    URL url; 
// Music(){
//     bgMusic();
//  }
Music(){  
  try {      
      f = new File("Taylor Swift-Sparks Fly.wav"); 
      uri = f.toURI();
      url = uri.toURL();  //解析地址
      AudioClip aau; 
      aau = Applet.newAudioClip(url);
      aau.loop();  //循环播放
  } catch (Exception e) 
  { e.printStackTrace();
  } 
}
 public static void main(String args[]) { 
   new Music();
 }
}
/*
接下来的这个是可以直接在Java代码插入这个函数，然后调用，this.Music();
void Music(){               //注意，java只能播放无损音质，如.wav这种格式
          try {      
              f = new File("Taylor Swift-Sparks Fly.wav"); //绝对路径
              uri = f.toURI();
              url = uri.toURL(); //解析路径
              AudioClip aau; 
              aau = Applet.newAudioClip(url);
              aau.loop();  //单曲循环
          } catch (Exception e) 
          { 
              e.printStackTrace();
          } 
        }
*/
