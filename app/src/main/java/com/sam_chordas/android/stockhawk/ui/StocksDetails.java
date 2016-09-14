package com.sam_chordas.android.stockhawk.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.sam_chordas.android.stockhawk.R;

public class StocksDetails extends Activity {

	public static final String ARG_STOCK_SYM = "stock_symbol";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stocks_details);

		TextView stock_symbol = (TextView) findViewById(R.id.stock_name);
		String stock_name = getIntent().getExtras().getString(ARG_STOCK_SYM);
		stock_symbol.setText(stock_name);
		stock_symbol.setContentDescription(stock_name);

	}
}
