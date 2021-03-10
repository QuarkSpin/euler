using System.Linq;
using Xunit;
using static CSharpEuler.Utils.MathFunctions;

namespace CSharpEulerTests.Utils
{
    public class MathFunctionsTests
    {
        [Fact]
        public void FibonacciTest()
        {
            Assert.Equal(new[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 }, Fibonacci().Take(12).ToArray());
        }
    }
}
