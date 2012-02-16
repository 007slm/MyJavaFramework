import org.outerj.daisy.backupTool.dbDump.AbstractDbDumper;

public class TestCommond {
	public static void main(String[] args) throws Exception {
		String s;
		Process process = Runtime.getRuntime().exec(
				"imp slmdoc/1@test20001 full=y file=E:/x5_dev/x5.2.1.1900/data/doc/backup/20111230_004/daisy-dbDump/daisy-dbDump.dmp");
		AbstractDbDumper.handleRuntimeProcess(process,null,System.out);
	}
}
