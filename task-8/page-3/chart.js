var data = getRandomJson();
// Restructring Data According To The Requirement
pizza_labels = [];
corresponding_values = [];
background_color = [];
for (i = 0; i < data.length; i++) {
  pizza_labels.push(data[i].pizza);
  corresponding_values.push(data[i].sold);
  background_color.push(random_rgba());
}
var ctx = document.getElementById("myChart").getContext("2d");
var myChart = new Chart(ctx, {
  type: "bar",
  data: {
    labels: pizza_labels,
    datasets: [
      {
        label: "Pizza Sales By Name",
        data: corresponding_values,
        backgroundColor: background_color,
        borderWidth: 1,
      },
    ],
  },
  options: {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
  },
});
// To generate random RGBA value
function random_rgba() {
  var o = Math.round,
    r = Math.random,
    s = 255;
  return (
    "rgba(" +
    o(r() * s) +
    "," +
    o(r() * s) +
    "," +
    o(r() * s) +
    "," +
    r().toFixed(1) +
    ")"
  );
}
