package com.example.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.math.BigInteger;

public final class TimeSeries extends UDF {
  public Text evaluate(final Integer i) {
    if (i == null) { return null; }
    String stars = new String();
    if(i > 0) {
      for(Integer counter = 0; counter < i; counter++) {
        stars += "*";
      }
      return new Text(stars.toString());
    }
    else
    {
      return new Text("");
    }
  }
}
