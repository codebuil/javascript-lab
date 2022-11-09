package calc.html.app;

import android.app.Activity;
import android.os.Bundle;

import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity
{
	boolean a;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView browser = (WebView) findViewById(R.id.webview);
		browser.getSettings().setJavaScriptEnabled(true);

		String pages="<html><head><title>javascript lab</title></head><body bgcolor=\"000FF00#\" style=\"color:black\"><br>output<br><TextArea ID=\"input2\"  style=\"color:black\" rows=\"8\" cols=\"50\"></TextArea><br>code<br><TextArea ID=\"input1\"  style=\"color:black\" rows=\"8\" cols=\"50\">\nfunction add(a,b){\nreturn a+b;\n}\nprint(add(10,12));\n</TextArea><p><button onclick=\"shelles012345678901234567890()\" style=\"color:black\">run</button></p><script>\nscreen012345678901234567890=\"\";\nfunction calls(s012345678901234567890)\n{\nreturn eval(s012345678901234567890.toString());\n}\nfunction print(s012345678901234567890)\n{\nscreen012345678901234567890=screen012345678901234567890+s012345678901234567890+\"\\n\";\n}\nfunction eeval012345678901234567890()\n{\nconst b012345678901234567890 = document.getElementById('input1');\nconst c012345678901234567890=document.getElementById('input2');\neval(b012345678901234567890.value);\nc012345678901234567890.value=screen012345678901234567890;\n}\nfunction shelles012345678901234567890()\n{\nscreen012345678901234567890=\"\";\neeval012345678901234567890();\n}\n</script></body></html>";
		browser.loadData(pages, "text/html", "UTF-8");


    }


}

