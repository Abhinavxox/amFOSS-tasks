import 'package:flutter/material.dart';
import 'package:flutter_app/HomePage.dart';
import 'package:introduction_screen/introduction_screen.dart';

class MainScreen extends StatelessWidget {
  const MainScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return IntroductionScreen(
      //for carousel
      pages: getPages(),
      globalBackgroundColor: Color.fromARGB(255, 212, 201, 198),
      //on clicking get started button
      onDone: () {
        Navigator.of(context).push(MaterialPageRoute(
          //on click return to welcome page
          builder: (context) => HomePage(),
        ));
      },
      //on clicking skip button
      onSkip: () {
        Navigator.of(context).push(MaterialPageRoute(
          builder: (context) => HomePage(),
        ));
      },
      showNextButton: false,
      showSkipButton: true,
      skip: const Text("SKIP",
          style: TextStyle(fontWeight: FontWeight.w600, color: Colors.black)),
      next: const Text("NEXT"),
      done: const Text("Get Started",
          style: TextStyle(fontWeight: FontWeight.w600, color: Colors.black)),
      //courousel dots design
      dotsDecorator: DotsDecorator(
          size: const Size.square(10.0),
          activeSize: const Size(20.0, 10.0),
          color: Colors.black26,
          activeColor: Colors.black,
          spacing: const EdgeInsets.symmetric(horizontal: 3.0),
          activeShape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(25.0),
          )),
    );
  }

  List<PageViewModel> getPages() {
    //list for corousel
    return [
      PageViewModel(
          image: Image.asset("assets/images/page1.png"),
          title: "YOGA SURGE",
          body: "Welcome to the yoga world",
          footer: const Text("Inhale the future, exhale the past")),
      PageViewModel(
        image: Image.asset("assets/images/page2.png"),
        title: "Healthy Freaks Excercises",
        body: "Letting go is the hardest asana",
      ),
      PageViewModel(
        image: Image.asset("assets/images/page3.png"),
        title: "Cycling",
        body:
            "You cannot always control what goes on outside, But you can always control what goes on inside",
      ),
      PageViewModel(
        image: Image.asset("assets/images/page4.png"),
        title: "Meditation",
        body: "The longest journey of any person is the journey inward.",
      ),
    ];
  }
}
