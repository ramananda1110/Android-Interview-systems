package ramananda.androidinterview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ForntPage extends Activity implements OnClickListener {

	Button btnSample, btnTough, btnOther, btnRate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fornt_page);
		getActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#00AAE8")));

		btnSample = (Button) findViewById(R.id.button1);
		btnTough = (Button) findViewById(R.id.button2);
		btnOther = (Button) findViewById(R.id.button3);
		btnRate = (Button) findViewById(R.id.button4);

		btnSample.setOnClickListener(this);
		btnTough.setOnClickListener(this);
		btnOther.setOnClickListener(this);
		btnRate.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			startActivity(new Intent(ForntPage.this, SampleQuestion.class));
			break;
		case R.id.button2:
			startActivity(new Intent(ForntPage.this, ToughQuestion.class));
			break;
		case R.id.button3:

			break;
		case R.id.button4:

			break;

		default:
			break;
		}
	}

}
