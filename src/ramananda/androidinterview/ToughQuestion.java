package ramananda.androidinterview;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ToughQuestion extends Activity implements OnClickListener {
	TextView tvX, tvY, answer, question;
	Button btnLeft, btnRight, btnAns;
	String[] tough_question, tough_answer;

	int index;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questions);
		getActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#00AAE8")));

		index = 0;
		tvX = (TextView) findViewById(R.id.tvxx);
		tvY = (TextView) findViewById(R.id.tvyy);
		answer = (TextView) findViewById(R.id.tvAnswer);
		question = (TextView) findViewById(R.id.tvQuestion);

		btnLeft = (Button) findViewById(R.id.btnLeft);
		btnRight = (Button) findViewById(R.id.btnRight);
		btnAns = (Button) findViewById(R.id.btnShowAnswer);

		tough_question = getResources().getStringArray(R.array.tough_question);
		tough_answer = getResources().getStringArray(R.array.tough_answer);

		question.setText(tough_question[index]);
		answer.setText("Press \"A\" button for Answer");
		tvX.setText(String.valueOf(index + 1) + "/");
		tvY.setText(String.valueOf(tough_question.length));

		// set button click listener
		btnLeft.setOnClickListener(this);
		btnRight.setOnClickListener(this);
		btnAns.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLeft:
			answer.setText("Press \"A\" button for Answer");
			index--;
			if (index == -1) {
				index = tough_question.length - 1;
				question.setText(tough_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			} else {
				question.setText(tough_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			}
			break;

		case R.id.btnShowAnswer:
			answer.setText(tough_answer[index]);
			break;

		case R.id.btnRight:
			answer.setText("Press \"A\" button for Answer");
			index++;
			if (index == tough_question.length) {
				index = 0;
				question.setText(tough_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			} else {
				question.setText(tough_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			}
			break;

		}
	}
}
