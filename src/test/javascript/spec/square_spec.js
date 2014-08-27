describe('JS Tests', function() {
    describe('Square', function() {
        it("should calculate square for 0", function() {
            expect(sq(0)).toEqual(0);
        });
        it("should calculate square for 1", function() {
            expect(sq(1)).toEqual(1);
        });
        it("should calculate square for 2", function() {
            expect(sq(2)).toEqual(4);
        });
        it("should detect failed tests", function() {
            expect(sq(10)).toEqual(101);
        });
    });
});
