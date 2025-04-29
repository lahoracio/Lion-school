package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.Alunos
import br.senai.sp.jandira.lionschool.screens.components.Logo

@Composable

fun TelaAluno(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.logo_lion),
                        contentDescription = stringResource(R.string.lion_school),
                        modifier = Modifier
                            .width(45.dp)
                            .height(56.dp)
                            .padding(vertical = 5.dp)
                    )
                    Text(
                        text = stringResource(R.string.lion_school),
                        fontSize = 15.sp,
                        color = colorResource(R.color.logo_blue),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier
                            .width(50.dp)
                            .padding(bottom = 10.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .width(52.dp)
                        .height(52.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.yellow)
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = stringResource(R.string.ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.logo_blue),
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.yellow)
                )
            ) {}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.find_your),
                    color = colorResource(R.color.gray_escuro)
                )

                    },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = colorResource(R.color.gray_escuro)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.yellow),
                    unfocusedContainerColor = colorResource(R.color.gray)
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.logo_blue))

                ) {
                    Text(
                        text = stringResource(R.string.todos),
                        color = colorResource(R.color.gray),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.yellow))

                ) {
                    Text(
                        text = stringResource(R.string.cursando),
                        color = colorResource(R.color.logo_blue),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.yellow))

                ) {
                    Text(
                        text = stringResource(R.string.finalized),
                        color = colorResource(R.color.logo_blue),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.graduation_hat),
                    contentDescription = "",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
                Text(
                    text = stringResource(R.string.strudents_list),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.logo_blue),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight(),

                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Alunos(
                    nome = "Luana Oliveira Dias",
                    documento = "20151001018",
                    anoTermino = "2022",
                    foto = painterResource(R.drawable.user1),



                )
                Alunos(
                    nome = "Pedro da Silva Borges",
                    documento = "20151001018",
                    anoTermino = "2022",
                    foto = painterResource(R.drawable.user2)
                )
                Alunos(
                    nome = "Ana CLara Gomes",
                    documento = "20151001018",
                    anoTermino = "2025",
                    foto = painterResource(R.drawable.user3)
                )
                Alunos(
                    nome = "Fabiana Luz Moraes",
                    documento = "20151001018",
                    anoTermino = "2022",
                    foto = painterResource(R.drawable.user4)
                )
                Alunos(
                    nome = "Carlos Augusto Nobre",
                    documento = "20151001018",
                    anoTermino = "2025",
                    foto = painterResource(R.drawable.user5)
                )
                Alunos(
                    nome = "Pedro Xavier",
                    documento = "20151001018",
                    anoTermino = "2025",
                    foto = painterResource(R.drawable.user6)
                )
                Alunos(
                    nome = "Pedro Xavier",
                    documento = "20151001018",
                    anoTermino = "2025",
                    foto = painterResource(R.drawable.user6)
                )



            }
        }
    }
}



@Preview(showSystemUi =  true)
@Composable
private fun TelaAlunoPreview(){
    TelaAluno()
}