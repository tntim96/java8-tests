describe('Complicated', function() {
    it("should detect non-number", function() {
        expect(check('a')).toEqual('invalid input');
    });
    it("should return result for 1", function() {
        expect(check(1)).toEqual("one or two");
    });
    it("should return result for 4", function() {
        expect(check(4)).toEqual("four");
    });
});