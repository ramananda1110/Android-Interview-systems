package ramananda.androidinterview;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SampleQuestion extends Activity implements OnClickListener {

	TextView tvX, tvY, answer, question;
	Button btnLeft, btnRight, btnAns;
	String[] simple_question, simple_answer;

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

		simple_question = getResources().getStringArray(
				R.array.simple_questions);
		simple_answer = getResources().getStringArray(R.array.simple_answers);

		question.setText(simple_question[index]);
		answer.setText("Press \"A\" button for Answer");
		tvX.setText(String.valueOf(index + 1) + "/");
		tvY.setText(String.valueOf(simple_question.length));

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
				index = simple_question.length - 1;
				question.setText(simple_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			} else {
				question.setText(simple_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			}
			break;

		case R.id.btnShowAnswer:
			answer.setText(simple_answer[index]);
			break;

		case R.id.btnRight:
			answer.setText("Press \"A\" button for Answer");
			index++;
			if (index == simple_question.length) {
				index = 0;
				question.setText(simple_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			} else {
				question.setText(simple_question[index]);
				tvX.setText(String.valueOf(index + 1) + "/");

			}
			break;

		}
	}
}
