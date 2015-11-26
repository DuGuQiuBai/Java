/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cn.itcast.util;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * 工具类
 * @author fqy
 */
public class UiUtil {
    
    private UiUtil(){}
    
    /**
     * 修改窗体图标
     * @param jf 
     */
    public static void setFrameIcon(JFrame jf,String imagePath){
        //获取工具类
        Toolkit took = Toolkit.getDefaultToolkit();
        //根据路径获取图片
        Image image = took.getImage(imagePath);
        //设置图标
        jf.setIconImage(image);
    }
    
    /**
     * 设置窗体居中
     * @param jf 
     */
    public static void setFrameCenter(JFrame jf){
        /*
        思路：
            获取屏幕的宽和高
            获取窗体的宽和高
        */
        //获取工具类
        Toolkit took = Toolkit.getDefaultToolkit();
        
        //获取屏幕的宽和高
        Dimension screen = took.getScreenSize();
        
       double screenWidth =  screen.getWidth();
       double screenHeight = screen.getHeight();
       
       //获取窗体的宽和高
       int jfWidth = jf.getWidth();
       int jfHeight = jf.getHeight();
       
       //设置坐标
       int width = (int)(screenWidth-jfWidth)/2;
       int height = (int)(screenHeight-jfHeight)/2;
       
      jf.setLocation(width,height);
    }
}
