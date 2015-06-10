# UiAutomator known issues

## EditText

EditText xml must contains an hint

    <EditText
        android:id="@+id/password_input"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:hint=""
        android:backgroundTint="@color/red"
        android:shadowColor="@color/red"/>

textPassword is not well supported, use ```text``` instead