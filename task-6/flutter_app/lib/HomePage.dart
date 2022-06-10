import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Welcome"),
        ),
        body: Center(
            child: Column(
          children: const [
            Image(image: AssetImage("assets/images/welcome.png")),
            Text("Abhinav Pandey",
                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 40)),
            Text(
                "I am from NEPAL and I am studying at Amrita Vishwa Vidhyapeetham, Amritapuri. I am in CSE-AI branch. I am a learning developer. " +
                    "I have some skills in programming languages like java, javascript and python.",
                style: TextStyle(fontSize: 20))
          ],
        )));
  }
}
