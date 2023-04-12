import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WriterReader {

	private int choiceNumber;
	private String reader;

	WriterReader(int choisNumber) {
		this.choiceNumber = choisNumber;
	}

	public List<String> Reader() throws IOException {
		List<String> lines = new ArrayList<String>();
		File file = new File("list.txt");
		BufferedReader bReader = new BufferedReader(new FileReader(file));
		while ((reader = bReader.readLine()) != null) {
			lines.add(reader);
		}
		bReader.close();
		return lines;
	}

	public List<String> Select(List<String> list) {
		Random r = new Random();
		int n =30;
		List<String> slct = new ArrayList<String>();
		for (int i = 0; i < this.choiceNumber; i++) {
			 int k =r.nextInt(n);
			slct.add(list.get(k)+"\n");
			list.remove(k);
			n--;
		}

		return slct;
	}

	public void Writer(List<String> list) throws IOException {

		File file = new File("selection.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		// clear selection.txt
		FileOutputStream writer = new FileOutputStream("selection.txt");
		writer.write(("").getBytes());
		writer.close();
		FileWriter fWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		for(int i = 0 ; i<list.size();i++) {
			bWriter.write(list.get(i));
		}
		bWriter.close();

	}
	
	public void Print(List<String> list) {
		list.forEach(i -> System.out.print(i));
	}

	public int getChoiceNumber() {
		return choiceNumber;
	}

	public void setChoiceNumber(int choiceNumber) {
		this.choiceNumber = choiceNumber;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

}
