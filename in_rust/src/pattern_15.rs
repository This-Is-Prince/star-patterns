pub fn pattern_15() {
    let row = 9;
    let column = 5;
    let mut symbol;
    let half_row = row / 2;

    for i in 0..row {
        symbol = 1;
        for j in 0..column {
            if i <= half_row {
                if j >= column - 1 - i {
                    print!("{}", symbol);
                    symbol += 1;
                } else {
                    print!(" ");
                }
            } else {
                if j >= i - column + 1 {
                    print!("{}", symbol);
                    symbol += 1;
                } else {
                    print!(" ");
                }
            }
        }
        println!();
    }
}
