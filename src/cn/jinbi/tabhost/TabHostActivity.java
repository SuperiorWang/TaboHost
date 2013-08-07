package cn.jinbi.tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabHostActivity extends TabActivity {
	private TabHost tabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost);
		tabHost = getTabHost();
		TabSpec tabSpec = tabHost.newTabSpec("page1");
		tabSpec.setIndicator("�ѽӵ绰");
		tabSpec.setContent(R.id.tab01);
		tabHost.addTab(tabSpec);
		
		TabSpec tabSpec2 = tabHost.newTabSpec("page1");
		tabSpec2.setIndicator("�����绰");
		tabSpec2.setContent(R.id.tab02);
		tabHost.addTab(tabSpec2);
		
		TabSpec tabSpec3 = tabHost.newTabSpec("page1");
		tabSpec3.setIndicator("δ�ӵ绰");
		tabSpec3.setContent(R.id.tab03);
		tabHost.addTab(tabSpec3);
	}

}
