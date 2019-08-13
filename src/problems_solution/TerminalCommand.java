package problems_solution;

import java.io.File;
import java.io.IOException;

public class TerminalCommand {
    public void testing () throws IOException {
        // We are running "dir" and "ping" command on cmd
        Runtime r = Runtime.getRuntime();
        try {
            Process proc = r.exec(new String[]{"/Applications/Utilities/Terminal.app/Contents/MacOS/Terminal","ls"});
            int exitVal = proc.waitFor(); // 阻塞当前线程，并等待外部程序中止后获取结果码
            System.out.println(exitVal == 0 ? "成功" : "失败");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
