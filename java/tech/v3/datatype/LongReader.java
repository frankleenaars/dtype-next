package tech.v3.datatype;

import clojure.lang.Keyword;
import java.util.stream.LongStream;


public interface LongReader extends PrimitiveReader
{
  long read(long idx);
  default boolean readBoolean(long idx) {return read(idx) != 0;}
  default byte readByte(long idx) {return (byte)read(idx);}
  default short readShort(long idx) {return (short)read(idx);}
  default char readChar(long idx) {return (char)read(idx);}
  default int readInt(long idx) {return (int)read(idx);}
  default long readLong(long idx) {return read(idx);}
  default float readFloat(long idx) {return (float)read(idx);}
  default double readDouble(long idx) {return (double)read(idx);}
  default Object readObject(long idx) {return read(idx);}
  default Object elemwiseDatatype () { return Keyword.intern(null, "int64"); }
  default LongStream typedStream() {
    return longStream();
  }
}
