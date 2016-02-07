package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hoge", "test1.a.zip", "aaa.zip", "aa.zi", "Ruby");

		list = list.stream().filter(s -> s.endsWith(".zip")).collect(Collectors.toList());

		System.out.println(list);

		List<Model> hl = Arrays.asList(new Model("hoge"), new Model("test1.a.zip"), new Model("aaa.zip"),
				new Model("aa.zi"), new Model("Ruby"));
		hl = hl.stream().filter(m -> m.getName().endsWith(".zip")).collect(Collectors.toList());
		
		System.out.println(hl.size());
	}

}
