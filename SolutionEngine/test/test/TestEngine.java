package test;

import org.surreal.engine.Engine;
import org.surreal.engine.EngineFactory;
import org.surreal.engine.query.QISet;
import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.results.ResultSet;

public class TestEngine {

	public static void main(String[] args) {
		try {
			String inifilename = args[0];
			Engine e = EngineFactory.generate(inifilename);
			QISet qs = new QISet();
			QueryInstantiation qi = new QueryInstantiation(0);
			qi.setQueryId(0);
			qi.addBindingEntry("alpha","ciao");
			qi.addBindingEntry("beta","themechanist");
			qs.add(qi);
			ResultSet res = e.solve(qs);
			String report = res.report();
			System.out.println(report);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
