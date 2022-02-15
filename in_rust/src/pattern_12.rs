pub fn pattern_12() {
    let row = 5;
    let column = 9;
    let symbol = "*";

    for i in 0..row {
        for j in 0..column {
            if j >= i && j <= column - 1 - i {
                print!("{}", symbol);
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
