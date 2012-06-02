package com.example.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.math.BigInteger;
import java.lang.Math;

public final class TimeSeries extends UDF {
  public Text evaluate(final Integer i) {
    if (i == null) { return null; }
    String stars = new String();
    if(i > 0) {
      {
        for(Integer counter = 0; counter < i; counter++) {
          // Every 3 count make a star
          if(counter % 20 == 0)
            stars += "*";
        }
      }
      return new Text(stars.toString());
    }
    else
    {
      return new Text("");
    }
  }
}
