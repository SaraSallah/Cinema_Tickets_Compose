package com.example.cinema_tickets_compose.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets_compose.ui.theme.PrimaryTextColor
import com.example.cinema_tickets_compose.ui.theme.Rubik

@Composable
fun DefaultText(text :String , colors:Color , fontSize: TextUnit,){
    Text(text = text,
        color =colors,
        fontSize =fontSize,
    fontFamily = Rubik)
}
@Composable
fun AlignText(text :String , colors:Color , fontSize: TextUnit,textAlign: TextAlign){
    Text(text = text,
        color =colors,
        fontSize =fontSize,
        fontFamily = Rubik ,
        textAlign = textAlign,
    )

}

@Preview(showBackground = true)
@Composable
fun PreviewDefaultText(){
    DefaultText(text ="Hello Every One", PrimaryTextColor,24.sp)
}