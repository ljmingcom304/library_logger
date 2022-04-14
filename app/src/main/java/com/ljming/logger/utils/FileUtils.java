package com.ljming.logger.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.io.File;

public class FileUtils {


   /**
    * 获取数据库存储路径/SDCard/Android/data/包名/cache/
    * 设置：对应清除缓存
    */
   public static String getCachePath(Context context, String dirName) {
      File root = context.getExternalCacheDir();
      if (root != null) {
         if (!TextUtils.isEmpty(dirName)) {
            String path = root.getAbsolutePath() + "/" + dirName + "/";
            File file = new File(path);
            if (!file.exists() && !file.mkdirs()) {
               Log.e(FileUtils.class.getSimpleName(), "can't make dirs in " + file.getAbsolutePath());
            }
            return path;
         } else {
            return root.getAbsolutePath();
         }
      }
      return null;
   }

}
