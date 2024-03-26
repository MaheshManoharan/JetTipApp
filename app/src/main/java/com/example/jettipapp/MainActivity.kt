 package com.example.jettipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettipapp.ui.theme.JetTipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTipAppTheme {
                MyApp {
                    Text("hi again")
                    }
                }

        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) 
{

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
//        content()
        TopHeader()
    }
}

 
// @Preview(showBackground = true)
 @Composable
 fun TopHeader(totalPerPerson: Double = 134.0)
 {
       Surface(
           modifier = Modifier
               .fillMaxWidth()
               .height(150.dp)
               .clip(
                   shape =
//           RoundedCornerShape(corner =
//              CornerSize(12.dp )))
                   CircleShape.copy(all = CornerSize(12.dp))
               ),
                   color = Color(0xFFE9D4FA),
       )
        {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    val total = "%.2f".format()
                    Text(text = "Total Per Person", style = MaterialTheme.typography.bodySmall)
                    Text(text =  "$totalPerPerson ", style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.ExtraBold
                    )
            }
       }
 }

@Preview
@Composable
 fun MainContent(){
     Surface(modifier = Modifier
         .padding(2.dp)
         .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(8.dp )),
           border = BorderStroke(1 .dp, color = Color.LightGray)
         )
     {
         Column {
             Text(text = "Hello again...")
             Text(text = "Hello again...")

             Text(text = "Hello again")
         }

     }
 }