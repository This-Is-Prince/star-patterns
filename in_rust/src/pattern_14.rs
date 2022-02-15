pub fn pattern_14() {
    let row = 7;
    let column = 7;
    let mut symbol;

    for i in 0..row {
        symbol = row - 1 - i;
        for j in 0..column {
            if j <= column - 1 - i {
                print!("{}", symbol);
                symbol -= 1;
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
