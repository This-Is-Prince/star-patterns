pub fn pattern_10() {
    let row = 9;
    let column = 9;
    let symbol = "*";
    let half_row = row / 2;

    for i in 0..row {
        for j in 0..column {
            if i <= half_row {
                if j >= half_row - i && j <= half_row + i {
                    print!("{}", symbol);
                } else {
                    print!(" ");
                }
            } else {
                let temp_i = row - 1 - i;
                if j >= half_row - temp_i && j <= half_row + temp_i {
                    print!("{}", symbol);
                } else {
                    print!(" ");
                }
            }
        }
        println!();
    }
}
