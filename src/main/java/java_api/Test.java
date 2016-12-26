package java_api;

/**
 * Created by wufeifei on 2016/6/17.
 */
public class Test {
    public static void main(String[] args) {
        String a="http://ehs.scksteel.com/getfile?fileid=239654CF8E8143E69CC1570DE73C3B3E.pdf";
        System.out.print(a.substring(a.lastIndexOf("fileid=")+"fileid=".length()));
//        CopyOnWriteArrayList<String> copyOnWriteArrayList=new CopyOnWriteArrayList();
//        copyOnWriteArrayList.add("aaa");
//        "a".hashCode();.
//        StringTokenizer stringTokenizer=new StringTokenizer("´ó ¼Ò ºÃ");
//        Runtime runtime = Runtime.getRuntime();
//        String [] cmd={"cmd","C:/","copy exe1 exe2"};
//        Process process = null;
//        try {
//            process = runtime.exec(cmd);
//            process.waitFor();
//            char[] b = new char[1024];
//            StringBuilder stringBuilder = new StringBuilder("result:"+"\n");
//            InputStreamReader reader = new InputStreamReader(process.getInputStream());
//            int count = 0;
//            while ((count = reader.read(b)) > 0) {
//                String str = new String(b, 0, count);
//                stringBuilder.append(str);
//            }
//            System.out.println(stringBuilder);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
