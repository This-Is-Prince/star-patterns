export default function pattern_1() {
  let row = 5;
  let column = 5;

  const symbol = "*";

  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      if (j <= i) {
        process.stdout.write(symbol);
      } else {
        process.stdout.write(" ");
      }
    }
    process.stdout.write("\n");
  }
}
