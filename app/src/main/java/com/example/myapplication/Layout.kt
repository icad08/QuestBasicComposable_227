package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylayout.R

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text("Ini di dalam Box", fontWeight = FontWeight.Bold)
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris1-Komponen1")
            Text("Baris1-Komponen2")
            Text("Baris1-Komponen3")
        }

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris2-Komponen1")
            Text("Baris2-Komponen2")
            Text("Baris2-Komponen3")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
            Text("Kolom1-Komponen3")
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom2-Komponen1")
            Text("Kolom2-Komponen2")
            Text("Kolom2-Komponen3")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // ✅ Pastikan file musik.png ada di folder res/drawable/
    val gambar = painterResource(id = R.drawable.musik)

    // Layout utama — seluruh konten di tengah layar
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White), // latar putih
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(300.dp) // area gambar + teks
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Gambar Musik",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(170.dp)
            )

            Text(
                text = "My Music",
                fontSize = 80.sp,
                color = Color(0xFF008080),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}