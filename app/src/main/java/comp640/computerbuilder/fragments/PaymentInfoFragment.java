package comp640.computerbuilder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Switch;

import comp640.computerbuilder.R;
import comp640.computerbuilder.backend.DataController;
import comp640.computerbuilder.logic.SettingsReference;
/**
 * Created by Brian on 4/25/2016.
 */
public class PaymentInfoFragment extends CBFragment{

    /**
     * Switches
     */
    private Button _placeOrderButton;
    private EditText _textPostalAddress1;
    private EditText _textPersonName1;
    private EditText _textCityStateZip;
    private EditText _textCVC;
    private EditText _textCreditCard;
    private DatePicker _datepickerExpiration;

    public PaymentInfoFragment(){
        _title = "Payment Info";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_payment_info, container, false);

        _textPostalAddress1= (EditText)view.findViewById(R.id.textPostalAddress1);
        _textCityStateZip= (EditText)view.findViewById(R.id.textCityStateZip);
        _textCreditCard= (EditText)view.findViewById(R.id.textCreditCard);
        _textCVC= (EditText)view.findViewById(R.id.textCVC);
        _datepickerExpiration= (DatePicker)view.findViewById(R.id.datePickerExpiration);
        _textPersonName1= (EditText)view.findViewById(R.id.textPersonName1);
        _placeOrderButton= (Button)view.findViewById(R.id.placeOrderButton);


        _placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createSubfragment(new BuildInfoFragment());
            }
        });
        return view;
    }



}