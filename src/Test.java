public class Test {
    public static void main(String[] args) {
// StringBuffer 是线程安全的. StringBuilder 不是.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append("hello");
        stringBuffer.append("hello");
        stringBuffer.append("hello");
    }

}
