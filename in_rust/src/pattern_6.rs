pub fn pattern_6() {
    let row = 5;
    let column = 9;
    let symbol = "*";
    let mut toggle;

    for i in 0..row {
        toggle = true;
        for j in 0..column {
            if j >= row - 1 - i && j <= row - 1 + i && toggle {
                toggle = false;
                print!("{}", symbol);
            } else {
                toggle = true;
                print!(" ");
            }
        }
        println!();
    }
}
