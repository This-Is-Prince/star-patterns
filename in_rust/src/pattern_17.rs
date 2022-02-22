pub fn pattern_17() {
    let row = 9;
    let column = 9;
    let symbol = "*";
    let mut index = 0;
    let half_row = row / 2;

    for i in 0..row {
        for j in 0..column {
            if j > half_row - index && j < half_row + index {
                print!(" ");
            } else {
                print!("{}", symbol)
            }
        }
        if i < half_row {
            index += 1;
        } else {
            index -= 1;
        }
        println!();
    }
}
